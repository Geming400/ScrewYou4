package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.StreamTagVisitor.ValueResult.class)
public class ValueResult360709672Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private static void values__437492218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-437492218L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private static void valueOf__788302205(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-788302205L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.HALT);
    }


}
