package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.JigsawStructure.MaxDistance.class)
public class MaxDistance1573041489Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_664415221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(664415221L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1951502282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1951502282L))
            info.setReturnValue("Yffp\uC731tLcH7\u46CF\"V`-h>\u773C\u3067:\u63DF*6\u1E16`fF\u74F8rl.C");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2130393580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2130393580L))
            info.setReturnValue(-632728600);
    }

    @Inject(at = @At("HEAD"), method = "vertical()I", cancellable = true)
    private void vertical_408051073(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(408051073L))
            info.setReturnValue(-1608339552);
    }

    @Inject(at = @At("HEAD"), method = "horizontal()I", cancellable = true)
    private void horizontal__1705314925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1705314925L))
            info.setReturnValue(-1691920472);
    }


}
