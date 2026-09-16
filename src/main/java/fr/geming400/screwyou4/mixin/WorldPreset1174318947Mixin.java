package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.presets.WorldPreset.class)
public class WorldPreset1174318947Mixin {
        @Inject(at = @At("HEAD"), method = "overworld()Ljava/util/Optional;", cancellable = true)
    private void overworld__946894257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-946894257L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createWorldDimensions()Lnet/minecraft/world/level/levelgen/WorldDimensions;", cancellable = true)
    private void createWorldDimensions_565500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(565500L))
            info.setReturnValue(null);
    }


}
