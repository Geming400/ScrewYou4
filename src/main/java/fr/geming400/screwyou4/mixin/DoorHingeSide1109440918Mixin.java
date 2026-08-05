package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.DoorHingeSide.class)
public class DoorHingeSide1109440918Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1879863947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1879863947L))
            info.setReturnValue("=m\uB6F6\"L^4\u0A8C=NP\uB781\u15B7&g\\\"E\"\u4683kGJV2 !G75DyfiQVNJ)\uB3DFX\uA006*d#Dk.u\u00D5*[KWs\"!\u5625n-_T[j5@5\u7E0B#ND_]PJ\u1DC3db\u734DS6Tci");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/DoorHingeSide;", cancellable = true)
    private static void values__1764840033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1764840033L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/DoorHingeSide;", cancellable = true)
    private static void valueOf__183877338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-183877338L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.DoorHingeSide.RIGHT);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1197649540(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1197649540L))
            info.setReturnValue("t@0\"^}\u4107u \u0210%xw]`ciu\u27B8nj@\u1BBB\u1F25t'y@");
    }


}
