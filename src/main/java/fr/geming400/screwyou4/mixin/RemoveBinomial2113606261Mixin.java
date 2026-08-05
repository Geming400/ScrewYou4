package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.RemoveBinomial.class)
public class RemoveBinomial2113606261Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__795848776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-795848776L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_978146286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(978146286L))
            info.setReturnValue(">[/gk_⣄;Q䖎ꥸ:hdP]");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2143098293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2143098293L))
            info.setReturnValue(2033539665);
    }

    @Inject(at = @At("HEAD"), method = "process(ILnet/minecraft/util/RandomSource;F)F", cancellable = true)
    private void process__1289769049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1289769049L))
            info.setReturnValue(3.827641E8F);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__445507311(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-445507311L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chance()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void chance__2049281436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2049281436L))
            info.setReturnValue(null);
    }


}
