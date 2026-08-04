package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.ButtonBlock.class)
public class ButtonBlock2120574573Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__438538999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-438538999L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "press(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void press_1979929551(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1979929551L))
            info.cancel();
    }


}
