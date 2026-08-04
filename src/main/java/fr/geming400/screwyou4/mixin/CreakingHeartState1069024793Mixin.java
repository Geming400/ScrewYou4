package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.CreakingHeartState.class)
public class CreakingHeartState1069024793Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__66435678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-66435678L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/CreakingHeartState;", cancellable = true)
    private static void values_2044639023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2044639023L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/CreakingHeartState;", cancellable = true)
    private static void valueOf_1042138834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1042138834L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__66435678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-66435678L))
            info.setReturnValue(null);
    }


}
