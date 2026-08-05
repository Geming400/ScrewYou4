package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.status.WorldGenContext.class)
public class WorldGenContext_1907274829Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1002180209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1002180209L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_771814853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(771814853L))
            info.setReturnValue("LI}ꑡxG㧐7k<|Drn):!H|佷");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1945537570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1945537570L))
            info.setReturnValue(-769053262);
    }

    @Inject(at = @At("HEAD"), method = "generator()Lnet/minecraft/world/level/chunk/ChunkGenerator;", cancellable = true)
    private void generator_110282422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(110282422L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "level()Lnet/minecraft/server/level/ServerLevel;", cancellable = true)
    private void level__1720154468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1720154468L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unsavedListener()Lnet/minecraft/world/level/chunk/LevelChunk$UnsavedListener;", cancellable = true)
    private void unsavedListener_249388693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(249388693L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "structureManager()Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;", cancellable = true)
    private void structureManager__263882505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-263882505L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lightEngine()Lnet/minecraft/server/level/ThreadedLevelLightEngine;", cancellable = true)
    private void lightEngine_995751696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(995751696L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mainThreadExecutor()Ljava/util/concurrent/Executor;", cancellable = true)
    private void mainThreadExecutor_1600972229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1600972229L))
            info.setReturnValue(null);
    }


}
