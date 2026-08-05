package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debugchart.TpsDebugDimensions.class)
public class TpsDebugDimensions1581131325Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/util/debugchart/TpsDebugDimensions;", cancellable = true)
    private static void values__85584248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-85584248L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/util/debugchart/TpsDebugDimensions;", cancellable = true)
    private static void valueOf_2088434629(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2088434629L))
            info.setReturnValue(net.minecraft.util.debugchart.TpsDebugDimensions.SCHEDULED_TASKS);
    }


}
