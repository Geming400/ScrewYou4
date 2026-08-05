package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.blending.Blender.BlendingOutput.class)
public class BlendingOutput_1684975832Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1224479206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1224479206L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_549515856(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(549515856L))
            info.setReturnValue("p,3⣊獛4hA犘2烾쫎oᇀS잋C$WMC⼔:<weT^䐂T9oᯬโ<OUls蔭X_뵯j7W@J#jQNYQufD蓈`aUr)2OitBeHA7");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1723238573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1723238573L))
            info.setReturnValue(-608188371);
    }

    @Inject(at = @At("HEAD"), method = "alpha()D", cancellable = true)
    private void alpha_1723233272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1723233272L))
            info.setReturnValue(7.470083005749967E8D);
    }

    @Inject(at = @At("HEAD"), method = "blendingOffset()D", cancellable = true)
    private void blendingOffset_1723233272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1723233272L))
            info.setReturnValue(7.470083005749967E8D);
    }


}
