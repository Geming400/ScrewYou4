package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager.class)
public class StructureTemplateManager_109787790Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/resources/Identifier;)V", cancellable = true)
    private void remove_471026116(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(471026116L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/resources/Identifier;)Ljava/util/Optional;", cancellable = true)
    private void get__346985207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-346985207L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "save(Lnet/minecraft/resources/Identifier;)Z", cancellable = true)
    private void save__1772471313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1772471313L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "save(Ljava/nio/file/Path;Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplate;Z)Z", cancellable = true)
    private static void save_166117915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(166117915L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getOrCreate(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplate;", cancellable = true)
    private void getOrCreate__1860983622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1860983622L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "testTemplates()Lnet/minecraft/world/level/levelgen/structure/templatesystem/loader/TemplatePathFactory;", cancellable = true)
    private void testTemplates__227909008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-227909008L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "worldTemplates()Lnet/minecraft/world/level/levelgen/structure/templatesystem/loader/TemplatePathFactory;", cancellable = true)
    private void worldTemplates_2061626224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2061626224L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listTemplates()Ljava/util/stream/Stream;", cancellable = true)
    private void listTemplates__423746393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-423746393L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onResourceManagerReload(Lnet/minecraft/server/packs/resources/ResourceManager;)V", cancellable = true)
    private void onResourceManagerReload_363031950(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(363031950L))
            info.cancel();
    }


}
