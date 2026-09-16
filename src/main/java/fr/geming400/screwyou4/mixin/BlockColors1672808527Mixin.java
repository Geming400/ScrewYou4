package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.color.block.BlockColors.class)
public class BlockColors1672808527Mixin {
        @Inject(at = @At("HEAD"), method = "register(Ljava/util/List;[Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void register__2076919859(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2076919859L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createDefault()Lnet/minecraft/client/color/block/BlockColors;", cancellable = true)
    private static void createDefault__424409637(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-424409637L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getColoringProperties(Lnet/minecraft/world/level/block/Block;)Ljava/util/Set;", cancellable = true)
    private void getColoringProperties_1929261537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1929261537L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTintSources(Lnet/minecraft/world/level/block/state/BlockState;)Ljava/util/List;", cancellable = true)
    private void getTintSources__896211657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-896211657L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTintSource(Lnet/minecraft/world/level/block/state/BlockState;I)Lnet/minecraft/client/color/block/BlockTintSource;", cancellable = true)
    private void getTintSource__1820189470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1820189470L))
            info.setReturnValue(null);
    }


}
