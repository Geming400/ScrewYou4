package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.HoverEvent.EntityTooltipInfo.class)
public class EntityTooltipInfo_1609371958Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1300083576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1300083576L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1647634203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1647634203L))
            info.setReturnValue(-1417451852);
    }

    @Inject(at = @At("HEAD"), method = "getTooltipLines()Ljava/util/List;", cancellable = true)
    private void getTooltipLines__1059258523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1059258523L))
            info.setReturnValue(null);
    }


}
