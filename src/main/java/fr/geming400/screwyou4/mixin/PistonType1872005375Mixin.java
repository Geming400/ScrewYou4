package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.PistonType.class)
public class PistonType1872005375Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1652538892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1652538892L))
            info.setReturnValue("S\u6FA9GaZ$}7\u89BAh}@\u5584N\u9581\u00CE|?yjC9dN05LK$[");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/PistonType;", cancellable = true)
    private static void values__1459337327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1459337327L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/PistonType;", cancellable = true)
    private static void valueOf_141146474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(141146474L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.PistonType.STICKY);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1960213997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1960213997L))
            info.setReturnValue("r_8ehq'Al.*5cE\u580F@3H");
    }


}
