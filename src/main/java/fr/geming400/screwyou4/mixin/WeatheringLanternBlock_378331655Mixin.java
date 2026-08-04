package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.WeatheringLanternBlock.class)
public class WeatheringLanternBlock_378331655Mixin {
        @Inject(at = @At("HEAD"), method = "getAge()Ljava/lang/Enum;", cancellable = true)
    private void getAge__1682613601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1682613601L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAge()Lnet/minecraft/world/level/block/WeatheringCopper$WeatherState;", cancellable = true)
    private void getAge_965515566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(965515566L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2114185378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2114185378L))
            info.setReturnValue(null);
    }


}
