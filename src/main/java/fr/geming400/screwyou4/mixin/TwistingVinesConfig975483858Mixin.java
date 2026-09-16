package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.TwistingVinesConfig.class)
public class TwistingVinesConfig975483858Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_66857590(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(66857590L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1745907383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1745907383L))
            info.setReturnValue("}e\uFED3+\uBFA8");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1532835949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1532835949L))
            info.setReturnValue(-827140813);
    }

    @Inject(at = @At("HEAD"), method = "maxHeight()I", cancellable = true)
    private void maxHeight__2093542163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2093542163L))
            info.setReturnValue(-281373815);
    }

    @Inject(at = @At("HEAD"), method = "spreadWidth()I", cancellable = true)
    private void spreadWidth__1244405371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1244405371L))
            info.setReturnValue(-1439221804);
    }

    @Inject(at = @At("HEAD"), method = "spreadHeight()I", cancellable = true)
    private void spreadHeight__901973634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-901973634L))
            info.setReturnValue(-199595248);
    }


}
