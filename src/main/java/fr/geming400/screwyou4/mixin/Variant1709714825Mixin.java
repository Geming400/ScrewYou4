package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.fish.TropicalFish.Variant.class)
public class Variant1709714825Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1199740212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1199740212L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_574254850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(574254850L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1747977567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1747977567L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pattern()Lnet/minecraft/world/entity/animal/fish/TropicalFish$Pattern;", cancellable = true)
    private void pattern__1533469722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1533469722L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "patternColor()Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private void patternColor__1149944241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1149944241L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "baseColor()Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private void baseColor__1149944241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1149944241L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPackedId()I", cancellable = true)
    private void getPackedId_1747977071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1747977071L))
            info.setReturnValue(null);
    }


}
