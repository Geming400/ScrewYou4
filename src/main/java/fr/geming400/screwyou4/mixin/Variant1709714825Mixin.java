package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.fish.TropicalFish.Variant.class)
public class Variant1709714825Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_801088557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(801088557L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1814828946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1814828946L))
            info.setReturnValue("WzY[\u9FD3 g^!}$_\u2A90B\uD6BE<%j(U254\u83D2=P\u9A00gh\u56C6-E'LILn^ \u0484\u9854\uA76CH\"h)\uC071`8HHv<E");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2027900380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2027900380L))
            info.setReturnValue(-1142568891);
    }

    @Inject(at = @At("HEAD"), method = "pattern()Lnet/minecraft/world/entity/animal/fish/TropicalFish$Pattern;", cancellable = true)
    private void pattern_192029270(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(192029270L))
            info.setReturnValue(net.minecraft.world.entity.animal.fish.TropicalFish.Pattern.BLOCKFISH);
    }

    @Inject(at = @At("HEAD"), method = "patternColor()Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private void patternColor__2080375492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2080375492L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.GREEN);
    }

    @Inject(at = @At("HEAD"), method = "baseColor()Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private void baseColor__14025987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-14025987L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.LIME);
    }

    @Inject(at = @At("HEAD"), method = "getPackedId()I", cancellable = true)
    private void getPackedId__342458394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-342458394L))
            info.setReturnValue(-1707738998);
    }


}
