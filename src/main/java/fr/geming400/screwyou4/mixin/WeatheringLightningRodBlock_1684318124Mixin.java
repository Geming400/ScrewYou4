package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.WeatheringLightningRodBlock.class)
public class WeatheringLightningRodBlock_1684318124Mixin {
        @Inject(at = @At("HEAD"), method = "getAge()Ljava/lang/Enum;", cancellable = true)
    private void getAge__376627132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-376627132L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAge()Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;", cancellable = true)
    private void getAge__2023465261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2023465261L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__874795449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-874795449L))
            info.setReturnValue(null);
    }


}
