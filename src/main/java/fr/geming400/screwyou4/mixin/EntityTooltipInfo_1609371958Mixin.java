package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.HoverEvent.EntityTooltipInfo.class)
public class EntityTooltipInfo_1609371958Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_700745193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(700745193L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2128243744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2128243744L))
            info.setReturnValue(1455506003);
    }

    @Inject(at = @At("HEAD"), method = "getTooltipLines()Ljava/util/List;", cancellable = true)
    private void getTooltipLines_1719737751(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1719737751L))
            info.setReturnValue(null);
    }


}
