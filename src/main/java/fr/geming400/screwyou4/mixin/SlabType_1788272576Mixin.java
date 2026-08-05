package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.SlabType.class)
public class SlabType_1788272576Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1736271692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1736271692L))
            info.setReturnValue("/*t!\u2F26Q\u41D5\uB874u3\u1575jQS*nx.\uF921XBkA:xi\uC02A\u41AF2r4\"6\u92E6EY8pu&$!Wo-z5Zm |(\u3363=");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/SlabType;", cancellable = true)
    private static void values_1394696560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1394696560L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/SlabType;", cancellable = true)
    private static void valueOf__1329891959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1329891959L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.SlabType.TOP);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1876481197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1876481197L))
            info.setReturnValue("\u4716l\u5DC41wkf\"aHAxf>Z3P,zuT2pZ'j48Em; YtCkzLuaDwq QA+Ff=qRr_2\u5991t>Q\uAF9C)gs");
    }


}
