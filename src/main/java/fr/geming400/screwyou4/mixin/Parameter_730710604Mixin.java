package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.Climate.Parameter.class)
public class Parameter_730710604Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__177915665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-177915665L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1501133632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1501133632L))
            info.setReturnValue("kIdY \uA2DD\uF92ACJC\uA24FWsJJKY\uC711ZJy=j\u8FBB$Qu6Q[Fy\uB5F77H4=|\u1252?/\u98F81]F$9R9F0xTxi1\u05E59\u092B\uFD65XX\u1D01$YfXv2jtC]5\u50F2|1/0B8my");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1288062694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1288062694L))
            info.setReturnValue(-184433801);
    }

    @Inject(at = @At("HEAD"), method = "min()J", cancellable = true)
    private void min__690415392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-690415392L))
            info.setReturnValue(-136249643908507628L);
    }

    @Inject(at = @At("HEAD"), method = "max()J", cancellable = true)
    private void max_1085781262(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1085781262L))
            info.setReturnValue(-2442583701245941004L);
    }

    @Inject(at = @At("HEAD"), method = "distance(J)J", cancellable = true)
    private void distance__1091922911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1091922911L))
            info.setReturnValue(5218532316637246649L);
    }

    @Inject(at = @At("HEAD"), method = "distance(Lnet/minecraft/world/level/biome/Climate$Parameter;)J", cancellable = true)
    private void distance_944332447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(944332447L))
            info.setReturnValue(4872459189390334736L);
    }

    @Inject(at = @At("HEAD"), method = "span(FF)Lnet/minecraft/world/level/biome/Climate$Parameter;", cancellable = true)
    private static void span_1601563934(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1601563934L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "span(Lnet/minecraft/world/level/biome/Climate$Parameter;Lnet/minecraft/world/level/biome/Climate$Parameter;)Lnet/minecraft/world/level/biome/Climate$Parameter;", cancellable = true)
    private static void span__1542586274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1542586274L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "span(Lnet/minecraft/world/level/biome/Climate$Parameter;)Lnet/minecraft/world/level/biome/Climate$Parameter;", cancellable = true)
    private void span_206367730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(206367730L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "point(F)Lnet/minecraft/world/level/biome/Climate$Parameter;", cancellable = true)
    private static void point__1286300562(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1286300562L))
            info.setReturnValue(null);
    }


}
