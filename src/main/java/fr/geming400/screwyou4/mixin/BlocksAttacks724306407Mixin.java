package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.BlocksAttacks.class)
public class BlocksAttacks724306407Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__184319861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-184319861L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1494729932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1494729932L))
            info.setReturnValue("[T\u6C7A\u1B75Z[f[DspMj9+0\u58F59@t\u4EB6ic?GdES>j:P\u1E32fi4etKkCb h9V\u2AFA^X\u60F9/3'1.idvSk Z1%+gc6e!5\u2F7A?`^wp39gb\"np1mNNP\u0123\u79EEpaZqSoL");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1281658498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1281658498L))
            info.setReturnValue(1989180055);
    }

    @Inject(at = @At("HEAD"), method = "disable(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;FLnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void disable__1283997394(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1283997394L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resolveBlockedDamage(Lnet/minecraft/world/damagesource/DamageSource;FD)F", cancellable = true)
    private void resolveBlockedDamage__1962600304(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1962600304L))
            info.setReturnValue(8.5953E7F);
    }

    @Inject(at = @At("HEAD"), method = "hurtBlockingItem(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/InteractionHand;F)V", cancellable = true)
    private void hurtBlockingItem_1497570382(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1497570382L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blockDelayTicks()I", cancellable = true)
    private void blockDelayTicks_996248749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(996248749L))
            info.setReturnValue(-1433387514);
    }

    @Inject(at = @At("HEAD"), method = "onBlocked(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void onBlocked_985766886(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(985766886L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bypassedBy()Ljava/util/Optional;", cancellable = true)
    private void bypassedBy__743357485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-743357485L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "damageReductions()Ljava/util/List;", cancellable = true)
    private void damageReductions_272322502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(272322502L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockDelaySeconds()F", cancellable = true)
    private void blockDelaySeconds__750933631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-750933631L))
            info.setReturnValue(8.5953E7F);
    }

    @Inject(at = @At("HEAD"), method = "disableSound()Ljava/util/Optional;", cancellable = true)
    private void disableSound__1643389540(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1643389540L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "disableCooldownScale()F", cancellable = true)
    private void disableCooldownScale_1660541011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1660541011L))
            info.setReturnValue(8.5953E7F);
    }

    @Inject(at = @At("HEAD"), method = "itemDamage()Lnet/minecraft/world/item/component/BlocksAttacks$ItemDamageFunction;", cancellable = true)
    private void itemDamage_1041097427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1041097427L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockSound()Ljava/util/Optional;", cancellable = true)
    private void blockSound__1846773225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1846773225L))
            info.setReturnValue(null);
    }


}
