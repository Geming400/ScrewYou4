package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.PackOutput.PathProvider.class)
public class PathProvider62453146Mixin {
        @Inject(at = @At("HEAD"), method = "file(Lnet/minecraft/resources/Identifier;Ljava/lang/String;)Ljava/nio/file/Path;", cancellable = true)
    private void file__2000807390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2000807390L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "json(Lnet/minecraft/resources/Identifier;)Ljava/nio/file/Path;", cancellable = true)
    private void json__1059776296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1059776296L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "json(Lnet/minecraft/resources/ResourceKey;)Ljava/nio/file/Path;", cancellable = true)
    private void json_1814110860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1814110860L))
            info.setReturnValue(null);
    }


}
