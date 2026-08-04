package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.PackOutput.PathProvider.class)
public class PathProvider62453146Mixin {
        @Inject(at = @At("HEAD"), method = "file(Lnet/minecraft/resources/Identifier;Ljava/lang/String;)Ljava/nio/file/Path;", cancellable = true)
    private void file_1719225766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1719225766L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "json(Lnet/minecraft/resources/ResourceKey;)Ljava/nio/file/Path;", cancellable = true)
    private void json_657876596(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(657876596L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "json(Lnet/minecraft/resources/Identifier;)Ljava/nio/file/Path;", cancellable = true)
    private void json__1651263504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1651263504L))
            info.setReturnValue(null);
    }


}
