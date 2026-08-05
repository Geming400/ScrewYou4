package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.Brain.Packed.class)
public class Packed284368898Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1669881157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1669881157L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__851091077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-851091077L))
            info.setReturnValue("]D4Č7쮟ZBB,G7{E黆/鮵357龑e=2@{;&w禌'墳0 ퟅⵁ奦l.,d)儬vX_Zh'=g`[Nwj|x!w1Cp嵉f퀋羨IpH\"X횀綦{<+넜g^Ŧܠ=l쓚ZL-1䃚");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_322631640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(322631640L))
            info.setReturnValue(24523326);
    }

    @Inject(at = @At("HEAD"), method = "memories()Lnet/minecraft/world/entity/ai/memory/MemoryMap;", cancellable = true)
    private void memories_587501335(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(587501335L))
            info.setReturnValue(null);
    }


}
