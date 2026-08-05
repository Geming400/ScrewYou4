package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.Display.TextDisplay.Align.class)
public class Align1351934430Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/Display$TextDisplay$Align;", cancellable = true)
    private static void values__1127940542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1127940542L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/Display$TextDisplay$Align;", cancellable = true)
    private static void valueOf_1494417033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1494417033L))
            info.setReturnValue(net.minecraft.world.entity.Display.TextDisplay.Align.LEFT);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1440143052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1440143052L))
            info.setReturnValue("U8<l^\uCE7Ddr9\u7F22_+QO'x*r0K{\u9B91\u7512wC;NX_4IF\uA74Dn:\u5A78P]f-)6D&^LMqC");
    }


}
