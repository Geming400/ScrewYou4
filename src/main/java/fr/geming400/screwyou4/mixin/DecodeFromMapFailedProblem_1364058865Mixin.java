package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.TagValueInput.DecodeFromMapFailedProblem.class)
public class DecodeFromMapFailedProblem_1364058865Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_455432596(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(455432596L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2134482389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2134482389L))
            info.setReturnValue("\uA931>T\u2EEER\u2BA4N(?4\uC032t\u7541*gaLtxUCc\u0F621EA]As[6j-/\u23E3_c5Nl)DQD7u[v7.OY\u7718@nLf-[oWtPw;]683\u23CAdJ=zm\u1B1BWgnSdF\u7D74}:Cu{ymo3 ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1921410955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1921410955L))
            info.setReturnValue(-81975279);
    }

    @Inject(at = @At("HEAD"), method = "error()Lcom/mojang/serialization/DataResult$Error;", cancellable = true)
    private void error__1122200429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1122200429L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "description()Ljava/lang/String;", cancellable = true)
    private void description_190071157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(190071157L))
            info.setReturnValue("_\u2F04FgS\uFE0F-MH_\u4BC8CSy5=wZvMnu5N.pEwJ.:v{T9M\u4CC2O|g07LZ8uu-+sx1mGe\uD027Yzb");
    }


}
