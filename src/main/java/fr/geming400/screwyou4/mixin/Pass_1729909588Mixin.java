package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.InteractionResult.Pass.class)
public class Pass_1729909588Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_821283319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(821283319L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1794634184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1794634184L))
            info.setReturnValue(">jdY@ )O\u1A29n\uC5C5u[8=3\u516F\u6968j\u77DET!j>RM\u90DB  ;gu!XB&)J\uC1AAzGbgV#t;94kWOFY");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2007705618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2007705618L))
            info.setReturnValue(-1368381704);
    }


}
