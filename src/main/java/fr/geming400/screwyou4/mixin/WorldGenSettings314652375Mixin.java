package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.WorldGenSettings.class)
public class WorldGenSettings314652375Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__820808096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-820808096L))
            info.setReturnValue("q<:d/敁K2?w쌴(t#xC1Tl be2jP@I;#洃cB_뒒kUir1Wpq2餵1⨈'>fi!p4%pmGVvK`xv{B]Ⱙ(a9?lq戃<_-");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_352914621(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(352914621L))
            info.setReturnValue(1099677843);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/level/levelgen/WorldOptions;Lnet/minecraft/core/RegistryAccess;)Lnet/minecraft/world/level/levelgen/WorldGenSettings;", cancellable = true)
    private static void of_1517034241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1517034241L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dimensions()Lnet/minecraft/world/level/levelgen/WorldDimensions;", cancellable = true)
    private void dimensions_1229374733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1229374733L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "options()Lnet/minecraft/world/level/levelgen/WorldOptions;", cancellable = true)
    private void options__1780856184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1780856184L))
            info.setReturnValue(null);
    }


}
