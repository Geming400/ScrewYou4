package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.StreamTagVisitor.ValueResult.class)
public class ValueResult360709672Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private static void values_1886763556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1886763556L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private static void valueOf_1581202347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1581202347L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.BREAK);
    }


}
