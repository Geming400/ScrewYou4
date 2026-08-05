package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.BellAttachType.class)
public class BellAttachType_2038481170Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/BellAttachType;", cancellable = true)
    private static void values_236496754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(236496754L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/BellAttachType;", cancellable = true)
    private static void valueOf__314638187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-314638187L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.BellAttachType.DOUBLE_WALL);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_903020698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(903020698L))
            info.setReturnValue("s_CtN\u3E06h\u9EE4 Q\u387B<\uA73F8X1{(0Bi|*t\u3066N^7PWVAv$&{\u1461o9\u9227a+3n/i<*<M\u43FC1\u3CF4z0=]=!\")xwsGa98\u2B46H%gtvy1S=&t.LH\u2E9FoX;\uA0AFX-\u51F7 Z");
    }


}
