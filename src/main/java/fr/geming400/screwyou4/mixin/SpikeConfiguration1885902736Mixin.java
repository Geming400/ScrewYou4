package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.SpikeConfiguration.class)
public class SpikeConfiguration1885902736Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_977276468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(977276468L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1638641035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1638641035L))
            info.setReturnValue("\u740AX7o`{jUhce9}PEaNHP\uA323@$*lfAgu]=\u9EB0\u39AA\uAF97\u3172\u1089V:bY\"UB\u8E3E>U(d<=3Og\uB9B7\uA5F2e\u9D9Dhuq&:]7'j3(&8MEiA\u549EZ3\uACA1^-_z\u659FM%;U`");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1851712469(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1851712469L))
            info.setReturnValue(-1363388242);
    }

    @Inject(at = @At("HEAD"), method = "state()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void state_1554392399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1554392399L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canReplace()Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;", cancellable = true)
    private void canReplace__545803111(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-545803111L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canPlaceOn()Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;", cancellable = true)
    private void canPlaceOn_1947570631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1947570631L))
            info.setReturnValue(null);
    }


}
