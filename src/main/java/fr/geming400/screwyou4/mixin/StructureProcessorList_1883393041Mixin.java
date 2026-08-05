package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorList.class)
public class StructureProcessorList_1883393041Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_747932569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(747932569L))
            info.setReturnValue("5?c1D꿩p&gJ;L-[Q9FZ슫6V%0xq$X/ﰴNSOc^6SOq85Xv[㙵S',lB卆76A>vᑩ5gD )鼭wTkp_uPB+.w纟\"};");
    }

    @Inject(at = @At("HEAD"), method = "list()Ljava/util/List;", cancellable = true)
    private void list__785237440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-785237440L))
            info.setReturnValue(null);
    }


}
