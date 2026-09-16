package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.status.WorldGenContext.class)
public class WorldGenContext_1907274829Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_998648560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(998648560L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1617268943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1617268943L))
            info.setReturnValue("'h]*WA0%<fx5X|\u9114yN#'\uB2688,x]%?+\u8BE0tnQC_,A\u9D6C:SU&KlgBp07qz ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1830340377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1830340377L))
            info.setReturnValue(-1183917299);
    }

    @Inject(at = @At("HEAD"), method = "generator()Lnet/minecraft/world/level/chunk/ChunkGenerator;", cancellable = true)
    private void generator_1423224329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1423224329L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "level()Lnet/minecraft/server/level/ServerLevel;", cancellable = true)
    private void level__1027478496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1027478496L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mainThreadExecutor()Ljava/util/concurrent/Executor;", cancellable = true)
    private void mainThreadExecutor__1520352529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1520352529L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "structureManager()Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;", cancellable = true)
    private void structureManager_609048369(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(609048369L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lightEngine()Lnet/minecraft/server/level/ThreadedLevelLightEngine;", cancellable = true)
    private void lightEngine__1945687272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1945687272L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unsavedListener()Lnet/minecraft/world/level/chunk/LevelChunk$UnsavedListener;", cancellable = true)
    private void unsavedListener__443571977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-443571977L))
            info.setReturnValue(null);
    }


}
