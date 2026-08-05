package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.flat.FlatLevelGeneratorPreset.class)
public class FlatLevelGeneratorPreset_1591917825Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1317537213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1317537213L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_456457849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(456457849L))
            info.setReturnValue("\u2218Zo!( .F{,B+t{;H\u111B\uAA7D01)MQzR");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1630180566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1630180566L))
            info.setReturnValue(1835883774);
    }

    @Inject(at = @At("HEAD"), method = "settings()Lnet/minecraft/world/level/levelgen/flat/FlatLevelGeneratorSettings;", cancellable = true)
    private void settings__134667116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-134667116L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "displayItem()Lnet/minecraft/core/Holder;", cancellable = true)
    private void displayItem__1154173700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1154173700L))
            info.setReturnValue(null);
    }


}
