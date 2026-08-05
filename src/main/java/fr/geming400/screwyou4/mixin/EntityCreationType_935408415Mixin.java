package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.LevelChunk.EntityCreationType.class)
public class EntityCreationType_935408415Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/chunk/LevelChunk$EntityCreationType;", cancellable = true)
    private static void values__502147094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-502147094L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/chunk/LevelChunk$EntityCreationType;", cancellable = true)
    private static void valueOf__35506301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-35506301L))
            info.setReturnValue(net.minecraft.world.level.chunk.LevelChunk.EntityCreationType.CHECK);
    }


}
