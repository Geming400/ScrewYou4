package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.templatesystem.loader.TemplatePathFactory.class)
public class TemplatePathFactory_1365823363Mixin {
        @Inject(at = @At("HEAD"), method = "createAndValidatePathToStructure(Lnet/minecraft/resources/Identifier;)Ljava/nio/file/Path;", cancellable = true)
    private void createAndValidatePathToStructure__661951238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-661951238L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createAndValidatePathToStructure(Lnet/minecraft/resources/Identifier;Lnet/minecraft/resources/FileToIdConverter;)Ljava/nio/file/Path;", cancellable = true)
    private void createAndValidatePathToStructure__1777433921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1777433921L))
            info.setReturnValue(null);
    }


}
