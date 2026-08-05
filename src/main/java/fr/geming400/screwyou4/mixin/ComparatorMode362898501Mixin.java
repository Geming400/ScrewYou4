package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.ComparatorMode.class)
public class ComparatorMode362898501Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1133321530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1133321530L))
            info.setReturnValue("8?/c2\u10610^ Jw}=ql\u0413ij\u307B|^&#&-u?5zd)Ijw");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/ComparatorMode;", cancellable = true)
    private static void values__1623360559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1623360559L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/ComparatorMode;", cancellable = true)
    private static void valueOf_141842730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(141842730L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.ComparatorMode.COMPARE);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_451107123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(451107123L))
            info.setReturnValue("@2+\u3F60c\u88ACwS2FQw<(atYA\u9E6Dp-wGScE+\u3434W])#?#m3A|Ta\uA2C5M36\u2389xNAT,pr]\uD354Q!gC<1\u518EGlSDc8U,8 \u735Ep+\u3C19T");
    }


}
