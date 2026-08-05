package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.BlockModelGenerators.WoodProvider.class)
public class WoodProvider_1683619656Mixin {
        @Inject(at = @At("HEAD"), method = "log(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/BlockModelGenerators$WoodProvider;", cancellable = true)
    private void log__302330345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-302330345L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wood(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/BlockModelGenerators$WoodProvider;", cancellable = true)
    private void wood__302330345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-302330345L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "logUVLocked(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/BlockModelGenerators$WoodProvider;", cancellable = true)
    private void logUVLocked__302330345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-302330345L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "logWithHorizontal(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/BlockModelGenerators$WoodProvider;", cancellable = true)
    private void logWithHorizontal__302330345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-302330345L))
            info.setReturnValue(null);
    }


}
