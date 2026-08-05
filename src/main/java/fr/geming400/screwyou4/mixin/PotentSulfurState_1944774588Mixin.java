package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.PotentSulfurState.class)
public class PotentSulfurState_1944774588Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1579769680(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1579769680L))
            info.setReturnValue(":+Vh[:{iW1kFO^6I']?&j\u57A5iUIug`#M@c`Q9[\uD6285^NUgpnoF");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/PotentSulfurState;", cancellable = true)
    private static void values__1007364266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1007364266L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/PotentSulfurState;", cancellable = true)
    private static void valueOf__1415753891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1415753891L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.PotentSulfurState.CONTINUOUS);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_2032983209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2032983209L))
            info.setReturnValue("v@");
    }


}
