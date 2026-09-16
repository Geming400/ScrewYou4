package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.PickedUpItemTrigger.TriggerInstance.class)
public class TriggerInstance172525629Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__736100639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-736100639L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_942949154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(942949154L))
            info.setReturnValue("`\uAA21r]N\uCD66\u4207\u1F794\u979D1F\u8E5DQw[,\u95D0o(2X,i&9t\"\uFB15\uAA20QZ$\uA47F +rN$;X4\uB6C8p_j^Ww}uN\u911Feq\u4BE0,S\u8882PQ\uBFE9?l\uA1AE:P\u9334>dtiF");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_729877720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(729877720L))
            info.setReturnValue(-1632832357);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/server/level/ServerPlayer;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void matches_35061691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(35061691L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContextSource;)V", cancellable = true)
    private void validate_432698735(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(432698735L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "item()Ljava/util/Optional;", cancellable = true)
    private void item__625988610(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-625988610L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player__1058127412(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1058127412L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "thrownItemPickedUpByEntity(Ljava/util/Optional;Ljava/util/Optional;Ljava/util/Optional;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void thrownItemPickedUpByEntity__434164511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-434164511L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "thrownItemPickedUpByPlayer(Ljava/util/Optional;Ljava/util/Optional;Ljava/util/Optional;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void thrownItemPickedUpByPlayer_1431650851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1431650851L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entity()Ljava/util/Optional;", cancellable = true)
    private void entity_262350030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(262350030L))
            info.setReturnValue(null);
    }


}
