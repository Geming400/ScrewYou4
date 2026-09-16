package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.flat.FlatLevelGeneratorPreset.class)
public class FlatLevelGeneratorPreset_1591917825Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_683291556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(683291556L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1932625947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1932625947L))
            info.setReturnValue(")Q,Q'm$f(f-BN\uCAC32/,\u6B70-H1'\u1F502XZ8fm\uA642\u13E6DsFJ1/Hb.{\uA889");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2145697381(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2145697381L))
            info.setReturnValue(-1821332135);
    }

    @Inject(at = @At("HEAD"), method = "displayItem()Lnet/minecraft/core/Holder;", cancellable = true)
    private void displayItem_2071805799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2071805799L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "settings()Lnet/minecraft/world/level/levelgen/flat/FlatLevelGeneratorSettings;", cancellable = true)
    private void settings__1883212361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1883212361L))
            info.setReturnValue(null);
    }


}
