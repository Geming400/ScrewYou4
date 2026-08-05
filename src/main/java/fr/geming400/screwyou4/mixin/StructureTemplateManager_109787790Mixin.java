package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager.class)
public class StructureTemplateManager_109787790Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/resources/Identifier;)V", cancellable = true)
    private void remove__1384653368(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1384653368L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/resources/Identifier;)Ljava/util/Optional;", cancellable = true)
    private void get__224103757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-224103757L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "save(Lnet/minecraft/resources/Identifier;)Z", cancellable = true)
    private void save__1384649524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1384649524L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "save(Ljava/nio/file/Path;Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplate;Z)Z", cancellable = true)
    private static void save_2043611896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2043611896L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getOrCreate(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplate;", cancellable = true)
    private void getOrCreate__287885681(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-287885681L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "worldTemplates()Lnet/minecraft/world/level/levelgen/structure/templatesystem/loader/TemplatePathFactory;", cancellable = true)
    private void worldTemplates_455268393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(455268393L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listTemplates()Ljava/util/stream/Stream;", cancellable = true)
    private void listTemplates__100918526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-100918526L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onResourceManagerReload(Lnet/minecraft/server/packs/resources/ResourceManager;)V", cancellable = true)
    private void onResourceManagerReload_208809671(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(208809671L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "testTemplates()Lnet/minecraft/world/level/levelgen/structure/templatesystem/loader/TemplatePathFactory;", cancellable = true)
    private void testTemplates_455268393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(455268393L))
            info.setReturnValue(null);
    }


}
