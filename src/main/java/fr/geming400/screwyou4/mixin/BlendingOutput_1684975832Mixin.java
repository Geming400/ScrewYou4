package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.blending.Blender.BlendingOutput.class)
public class BlendingOutput_1684975832Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_776349563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(776349563L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1839567940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1839567940L))
            info.setReturnValue("C7\uCE49F%vzC+y'WF\u78AF^LD\u8077\"*v9,I*U os\u9A2024HP^-,&\u1239\"/JX8\u3CE0cQRb8g!9\u3BABz\u5C47\uC91C%{!}D|:;ZqUs\u16A0c!\uB8A7 Sp_HOnJ\uC892?R\u73F91Q!T?");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2052639374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2052639374L))
            info.setReturnValue(-41514390);
    }

    @Inject(at = @At("HEAD"), method = "alpha()D", cancellable = true)
    private void alpha_419097946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(419097946L))
            info.setReturnValue(1.2275120014276399E8D);
    }

    @Inject(at = @At("HEAD"), method = "blendingOffset()D", cancellable = true)
    private void blendingOffset__878059372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-878059372L))
            info.setReturnValue(1.227512002778691E8D);
    }


}
