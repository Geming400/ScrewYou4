package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.WeatheringLightningRodBlock.class)
public class WeatheringLightningRodBlock_1684318124Mixin {
        @Inject(at = @At("HEAD"), method = "getAge()Ljava/lang/Enum;", cancellable = true)
    private void getAge__293631091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-293631091L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAge()Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;", cancellable = true)
    private void getAge_883080298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(883080298L))
            info.setReturnValue(net.minecraft.world.level.block.WeatheringCopper.WeatherState.UNAFFECTED);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1544203919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1544203919L))
            info.setReturnValue(null);
    }


}
