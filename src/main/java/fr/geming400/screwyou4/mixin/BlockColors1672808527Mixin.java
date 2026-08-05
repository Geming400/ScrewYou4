package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.color.block.BlockColors.class)
public class BlockColors1672808527Mixin {
        @Inject(at = @At("HEAD"), method = "register(Ljava/util/List;[Lnet/minecraft/world/level/block/Block;)V", cancellable = true)
    private void register_297866128(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(297866128L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTintSources(Lnet/minecraft/world/level/block/state/BlockState;)Ljava/util/List;", cancellable = true)
    private void getTintSources__1071098000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1071098000L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTintSource(Lnet/minecraft/world/level/block/state/BlockState;I)Lnet/minecraft/client/color/block/BlockTintSource;", cancellable = true)
    private void getTintSource_1709832782(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1709832782L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getColoringProperties(Lnet/minecraft/world/level/block/Block;)Ljava/util/Set;", cancellable = true)
    private void getColoringProperties__891938375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-891938375L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDefault()Lnet/minecraft/client/color/block/BlockColors;", cancellable = true)
    private static void createDefault_1587486582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1587486582L))
            info.setReturnValue(new net.minecraft.client.color.block.BlockColors());
    }


}
