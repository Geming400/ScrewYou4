package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.StreamTagVisitor.EntryResult.class)
public class EntryResult41149481Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/nbt/StreamTagVisitor$EntryResult;", cancellable = true)
    private static void values_250772036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(250772036L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/nbt/StreamTagVisitor$EntryResult;", cancellable = true)
    private static void valueOf__54789173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-54789173L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.EntryResult.BREAK);
    }


}
