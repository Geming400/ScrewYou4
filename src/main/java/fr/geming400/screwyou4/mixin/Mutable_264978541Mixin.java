package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.ItemEnchantments.Mutable.class)
public class Mutable_264978541Mixin {
        @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/core/Holder;I)V", cancellable = true)
    private void set_988467625(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(988467625L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keySet()Ljava/util/Set;", cancellable = true)
    private void keySet__1564056946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1564056946L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeIf(Ljava/util/function/Predicate;)V", cancellable = true)
    private void removeIf_335335086(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(335335086L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLevel(Lnet/minecraft/core/Holder;)I", cancellable = true)
    private void getLevel_1811441185(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1811441185L))
            info.setReturnValue(1825007562);
    }

    @Inject(at = @At("HEAD"), method = "toImmutable()Lnet/minecraft/world/item/enchantment/ItemEnchantments;", cancellable = true)
    private void toImmutable_1933758686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1933758686L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "upgrade(Lnet/minecraft/core/Holder;I)V", cancellable = true)
    private void upgrade_988467625(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(988467625L))
            info.cancel();
    }


}
