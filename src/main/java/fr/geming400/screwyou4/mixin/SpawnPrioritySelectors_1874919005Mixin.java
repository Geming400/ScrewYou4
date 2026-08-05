package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.variant.SpawnPrioritySelectors.class)
public class SpawnPrioritySelectors_1874919005Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1034536033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1034536033L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_739459029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(739459029L))
            info.setReturnValue("섦傪1gj/鸡?$kZ7@ࡍIF(1n/!.w(q1(oB原>*f\"醢H6.Z-마f}PM");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1913181746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1913181746L))
            info.setReturnValue(2005950557);
    }

    @Inject(at = @At("HEAD"), method = "single(Lnet/minecraft/world/entity/variant/SpawnCondition;I)Lnet/minecraft/world/entity/variant/SpawnPrioritySelectors;", cancellable = true)
    private static void single__1252923387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1252923387L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fallback(I)Lnet/minecraft/world/entity/variant/SpawnPrioritySelectors;", cancellable = true)
    private static void fallback_1583290039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1583290039L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "selectors()Ljava/util/List;", cancellable = true)
    private void selectors__793711476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-793711476L))
            info.setReturnValue(null);
    }


}
