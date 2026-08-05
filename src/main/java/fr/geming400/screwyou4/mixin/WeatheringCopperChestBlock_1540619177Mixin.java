package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.WeatheringCopperChestBlock.class)
public class WeatheringCopperChestBlock_1540619177Mixin {
        @Inject(at = @At("HEAD"), method = "getAge()Ljava/lang/Enum;", cancellable = true)
    private void getAge__437330038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-437330038L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAge()Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;", cancellable = true)
    private void getAge_739381351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(739381351L))
            info.setReturnValue(net.minecraft.world.level.block.WeatheringCopper.WeatherState.EXPOSED);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1687902866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1687902866L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isWaxed()Z", cancellable = true)
    private void isWaxed__694175172(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-694175172L))
            info.setReturnValue(false);
    }


}
