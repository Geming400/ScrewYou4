package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorList.class)
public class StructureProcessorList_1883393041Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1641151227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1641151227L))
            info.setReturnValue("0U,B=`g93k@*^\uA170+K'\u8319\uA170u\u4066-np)y\u2894`ZKL@WL\uC265\uB59Fd\"W!x`J\u2914<d[F&;/J5|D\u94A6:LS\u41315Ib!NK\u6F4ET9b*\uC24B-S");
    }

    @Inject(at = @At("HEAD"), method = "list()Ljava/util/List;", cancellable = true)
    private void list__1282117666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1282117666L))
            info.setReturnValue(null);
    }


}
