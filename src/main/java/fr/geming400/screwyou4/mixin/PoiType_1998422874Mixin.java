package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.village.poi.PoiType.class)
public class PoiType_1998422874Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__911032164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-911032164L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_862962898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(862962898L))
            info.setReturnValue("wcCV>7[_D=Sch\"SSdC=</Zd./KIb$\u5BD5VPup\u4901JLSY\u5BA1\u1DE1^1,uj:?\u796FHm");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2036685615(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2036685615L))
            info.setReturnValue(-1247338150);
    }

    @Inject(at = @At("HEAD"), method = "is(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void is_1853133887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1853133887L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "validRange()I", cancellable = true)
    private void validRange_2036685119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2036685119L))
            info.setReturnValue(-1044190730);
    }

    @Inject(at = @At("HEAD"), method = "maxTickets()I", cancellable = true)
    private void maxTickets_2036685119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2036685119L))
            info.setReturnValue(-1044190730);
    }

    @Inject(at = @At("HEAD"), method = "matchingStates()Ljava/util/Set;", cancellable = true)
    private void matchingStates_169387387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(169387387L))
            info.setReturnValue(null);
    }


}
