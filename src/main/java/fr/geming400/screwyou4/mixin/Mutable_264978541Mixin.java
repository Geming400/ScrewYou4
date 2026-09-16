package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.ItemEnchantments.Mutable.class)
public class Mutable_264978541Mixin {
        @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/core/Holder;I)V", cancellable = true)
    private void set__1187403385(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1187403385L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keySet()Ljava/util/Set;", cancellable = true)
    private void keySet__334569429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-334569429L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeIf(Ljava/util/function/Predicate;)V", cancellable = true)
    private void removeIf__1269735859(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1269735859L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLevel(Lnet/minecraft/core/Holder;)I", cancellable = true)
    private void getLevel_789377007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(789377007L))
            info.setReturnValue(-760331618);
    }

    @Inject(at = @At("HEAD"), method = "toImmutable()Lnet/minecraft/world/item/enchantment/ItemEnchantments;", cancellable = true)
    private void toImmutable_489018167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(489018167L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "upgrade(Lnet/minecraft/core/Holder;I)V", cancellable = true)
    private void upgrade_992406285(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(992406285L))
            info.cancel();
    }


}
