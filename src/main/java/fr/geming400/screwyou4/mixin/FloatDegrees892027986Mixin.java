package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.MinMaxBounds.FloatDegrees.class)
public class FloatDegrees892027986Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__16598282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-16598282L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1662451511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1662451511L))
            info.setReturnValue("OozsR 5TC@Lxkq@>u!_F.=>PgC_");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1449380077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1449380077L))
            info.setReturnValue(240680101);
    }

    @Inject(at = @At("HEAD"), method = "bounds()Lnet/minecraft/advancements/predicates/MinMaxBounds$Bounds;", cancellable = true)
    private void bounds_1320126682(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1320126682L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromReader(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/advancements/predicates/MinMaxBounds$FloatDegrees;", cancellable = true)
    private static void fromReader__449678520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-449678520L))
            info.setReturnValue(null);
    }


}
